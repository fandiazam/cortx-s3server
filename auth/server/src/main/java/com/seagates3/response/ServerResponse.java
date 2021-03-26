/*
 * Copyright (c) 2020 Seagate Technology LLC and/or its Affiliates
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For any questions about this software or licensing,
 * please email opensource@seagate.com or cortx-questions@seagate.com.
 *
 */

package com.seagates3.response;

import io.netty.handler.codec.http.HttpResponseStatus;

public class ServerResponse {

    String responseBody;
    HttpResponseStatus responseStatus;

    public ServerResponse() {}

    public ServerResponse(HttpResponseStatus responseStatus, String responseBody) {
        this.responseBody = responseBody;
        this.responseStatus = responseStatus;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseStatus(HttpResponseStatus status) {
        responseStatus = status;
    }

    public void setResponseBody(String body) {
        responseBody = body;
    }

    public HttpResponseStatus getResponseStatus() {
        return responseStatus;
    }
}