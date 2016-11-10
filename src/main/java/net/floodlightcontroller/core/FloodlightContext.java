/**
*    Copyright 2011, Big Switch Networks, Inc. 
*    Originally created by David Erickson, Stanford University
* 
*    Licensed under the Apache License, Version 2.0 (the "License"); you may
*    not use this file except in compliance with the License. You may obtain
*    a copy of the License at
*
*         http://www.apache.org/licenses/LICENSE-2.0
*
*    Unless required by applicable law or agreed to in writing, software
*    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
*    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
*    License for the specific language governing permissions and limitations
*    under the License.
**/

package net.floodlightcontroller.core;

import java.util.concurrent.ConcurrentHashMap;

/**
 * This is a context object where floodlight listeners can register 
 * and later retrieve context information associated with an
 * event
 * @author readams
 */
public class FloodlightContext {
    protected ConcurrentHashMap<String, Object> storage =
            new ConcurrentHashMap<String, Object>();
    private long eventId = -1;

    public ConcurrentHashMap<String, Object> getStorage() {
        return storage;
    }
    
    public void setEventId(long id) {
    	if (eventId == -1) {
    		this.eventId = id;
    	}
    }
    
    public long getId() {
    	return eventId;
    }
}