/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterServersRequest extends RpcAcsRequest<RegisterServersResponse> {
	
	public RegisterServersRequest() {
		super("hdr", "2017-09-25", "RegisterServers", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String serverInstancesInfo;

	private String sitePairId;

	public String getServerInstancesInfo() {
		return this.serverInstancesInfo;
	}

	public void setServerInstancesInfo(String serverInstancesInfo) {
		this.serverInstancesInfo = serverInstancesInfo;
		if(serverInstancesInfo != null){
			putQueryParameter("ServerInstancesInfo", serverInstancesInfo);
		}
	}

	public String getSitePairId() {
		return this.sitePairId;
	}

	public void setSitePairId(String sitePairId) {
		this.sitePairId = sitePairId;
		if(sitePairId != null){
			putQueryParameter("SitePairId", sitePairId);
		}
	}

	@Override
	public Class<RegisterServersResponse> getResponseClass() {
		return RegisterServersResponse.class;
	}

}