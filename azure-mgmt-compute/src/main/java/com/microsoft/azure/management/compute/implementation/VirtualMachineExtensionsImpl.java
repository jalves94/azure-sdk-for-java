package com.microsoft.azure.management.compute.implementation;
import com.microsoft.azure.management.compute.VirtualMachine;
import com.microsoft.azure.management.compute.VirtualMachineExtension;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.ExternalChildResourcesImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a extension collection associated with a virtual machine.
 */
class VirtualMachineExtensionsImpl extends
        ExternalChildResourcesImpl<VirtualMachineExtensionImpl,
                        VirtualMachineExtension,
                        VirtualMachineExtensionInner,
                        VirtualMachineImpl,
                        VirtualMachine> {
    private final VirtualMachineExtensionsInner client;

    /**
     * Creates new VirtualMachineExtensionsImpl.
     *
     * @param client the client to perform REST calls on extensions
     * @param parent the parent virtual machine of the extensions
     */
    VirtualMachineExtensionsImpl(VirtualMachineExtensionsInner client, VirtualMachineImpl parent) {
        super(parent, "VirtualMachineExtension");
        this.client = client;
        this.initializeCollection();
    }

    /**
     * @return the extension as a map indexed by name.
     */
    public Map<String, VirtualMachineExtension> asMap() {
        Map<String, VirtualMachineExtension> result = new HashMap<>();
        for (Map.Entry<String, VirtualMachineExtensionImpl> entry : this.collection().entrySet()) {
            VirtualMachineExtensionImpl extension = entry.getValue();
            if (extension.isReference()) {
                extension = new VirtualMachineExtensionImpl(entry.getKey(),
                        this.parent(),
                        this.client.get(parent().resourceGroupName(), parent().name(), entry.getKey()),
                        this.client);
            }
            result.put(entry.getKey(), extension);
        }
        return Collections.unmodifiableMap(result);
    }

    /**
     * Starts an extension definition chain.
     *
     * @param name the reference name of the extension to be added
     * @return the extension
     */
    public VirtualMachineExtensionImpl define(String name) {
        return this.prepareDefine(name);
    }

    /**
     * Starts an extension update chain.
     *
     * @param name the reference name of the extension to be updated
     * @return the extension
     */
    public VirtualMachineExtensionImpl update(String name) {
        return this.prepareUpdate(name);
    }

    /**
     * Mark the extension with given name as to be removed.
     *
     * @param name the reference name of the extension to be removed
     */
    public void remove(String name) {
        this.prepareRemove(name);
    }

    /**
     * Adds the extension to the collection.
     *
     * @param extension the extension
     */
    public void addExtension(VirtualMachineExtensionImpl extension) {
        this.addChildResource(extension);
    }

    @Override
    protected List<VirtualMachineExtensionImpl> listChildResources() {
        List<VirtualMachineExtensionImpl> childResources = new ArrayList<>();
        if (parent().inner().resources() != null) {
            for (VirtualMachineExtensionInner inner : parent().inner().resources()) {
                if (inner.name() == null) {
                    inner.withLocation(parent().regionName());
                    childResources.add(new VirtualMachineExtensionImpl(ResourceUtils.nameFromResourceId(inner.id()),
                            this.parent(),
                            inner,
                            this.client));
                } else {
                    childResources.add(new VirtualMachineExtensionImpl(inner.name(),
                            this.parent(),
                            inner,
                            this.client));
                }
            }
        }
        return childResources;
    }

    @Override
    protected VirtualMachineExtensionImpl newChildResource(String name) {
        VirtualMachineExtensionImpl extension = VirtualMachineExtensionImpl
                .newVirtualMachineExtension(name, this.parent(), this.client);
        return extension;
    }
}
