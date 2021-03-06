package ch.cyclops.load.model;

/**
 * Copyright (c) 2015. Zuercher Hochschule fuer Angewandte Wissenschaften
 * All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 * <p>
 * Created by Manu Perez on 02/08/16.
 */

public class CyclopsSettings {
    private String udrDataUrl;
    private String billingUrl;
    private String cdrDataUrl;
    private String billType;

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getCdrDataUrl() {
        return cdrDataUrl;
    }

    public void setCdrDataUrl(String cdrDataUrl) {
        this.cdrDataUrl = cdrDataUrl;
    }

    public String getUdrDataUrl() {
        return udrDataUrl;
    }

    public void setUdrDataUrl(String udrDataUrl) {
        this.udrDataUrl = udrDataUrl;
    }

    public String getBillingUrl() {
        return billingUrl;
    }

    public void setBillingUrl(String billingUrl) {
        this.billingUrl = billingUrl;
    }
}
