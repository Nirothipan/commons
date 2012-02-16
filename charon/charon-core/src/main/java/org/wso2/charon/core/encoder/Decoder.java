/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.charon.core.encoder;

import org.json.simple.parser.ParseException;
import org.wso2.charon.core.exceptions.AbstractCharonException;
import org.wso2.charon.core.exceptions.BadRequestException;
import org.wso2.charon.core.objects.SCIMObject;
import org.wso2.charon.core.schema.SCIMResourcesSchema;

/**
 * SCIM API which is based on REST style, may support multiple formats of the resource.
 * API users can use this interface to implement their own decoders and register them.
 */
public interface Decoder {

    /**
     * Decode the resource string sent in the SCIM request/response payload.
     *
     * @param scimResourceString
     * @return
     */
    public SCIMObject decodeSCIMResourceString(String scimResourceString,
                                               SCIMResourcesSchema scimResourceSchema)
            throws BadRequestException;

    /**
     * Decode the string sent in the SCIM response payload, which is an exception.
     *
     * @param scimExceptionString
     * @return
     */
    public AbstractCharonException decodeSCIMException(String scimExceptionString);

}
