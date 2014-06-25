/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* Optional. Parameters of the the certificate for encrypting the private
* configuration data. Supported on WebRole or WorkerRole, but ignored on
* VmRole.
*/
public class ExtensionCertificateConfiguration {
    private String storeLocation;
    
    /**
    * Required. Required for certificate declaration. The Windows certificate
    * store location to install the certificate for encryption, if required.
    * Its value has to be 'LocalMachine' if present.
    * @return The StoreLocation value.
    */
    public String getStoreLocation() {
        return this.storeLocation;
    }
    
    /**
    * Required. Required for certificate declaration. The Windows certificate
    * store location to install the certificate for encryption, if required.
    * Its value has to be 'LocalMachine' if present.
    * @param storeLocationValue The StoreLocation value.
    */
    public void setStoreLocation(final String storeLocationValue) {
        this.storeLocation = storeLocationValue;
    }
    
    private String storeName;
    
    /**
    * Optional. Optional. The Windows certificate store name to install the
    * certificate for encryption, if required. Its value has to be 'My' if
    * present.
    * @return The StoreName value.
    */
    public String getStoreName() {
        return this.storeName;
    }
    
    /**
    * Optional. Optional. The Windows certificate store name to install the
    * certificate for encryption, if required. Its value has to be 'My' if
    * present.
    * @param storeNameValue The StoreName value.
    */
    public void setStoreName(final String storeNameValue) {
        this.storeName = storeNameValue;
    }
    
    private String thumbprintAlgorithm;
    
    /**
    * Optional. Optional. The thumbprint algorithm of the certificate for
    * encryption, if required. Its value has to be 'sha1' if present.
    * @return The ThumbprintAlgorithm value.
    */
    public String getThumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }
    
    /**
    * Optional. Optional. The thumbprint algorithm of the certificate for
    * encryption, if required. Its value has to be 'sha1' if present.
    * @param thumbprintAlgorithmValue The ThumbprintAlgorithm value.
    */
    public void setThumbprintAlgorithm(final String thumbprintAlgorithmValue) {
        this.thumbprintAlgorithm = thumbprintAlgorithmValue;
    }
    
    private Boolean thumbprintRequired;
    
    /**
    * Optional. Optional. Whether thumbprint is required for the certificate
    * for encryption or not. Its value has to be 'true' or 'false'
    * (case-sensitive) if present.
    * @return The ThumbprintRequired value.
    */
    public Boolean isThumbprintRequired() {
        return this.thumbprintRequired;
    }
    
    /**
    * Optional. Optional. Whether thumbprint is required for the certificate
    * for encryption or not. Its value has to be 'true' or 'false'
    * (case-sensitive) if present.
    * @param thumbprintRequiredValue The ThumbprintRequired value.
    */
    public void setThumbprintRequired(final Boolean thumbprintRequiredValue) {
        this.thumbprintRequired = thumbprintRequiredValue;
    }
    
    /**
    * Initializes a new instance of the ExtensionCertificateConfiguration class.
    *
    */
    public ExtensionCertificateConfiguration() {
    }
    
    /**
    * Initializes a new instance of the ExtensionCertificateConfiguration class
    * with required arguments.
    *
    */
    public ExtensionCertificateConfiguration(String storeLocation) {
        if (storeLocation == null) {
            throw new NullPointerException("storeLocation");
        }
        this.setStoreLocation(storeLocation);
    }
}