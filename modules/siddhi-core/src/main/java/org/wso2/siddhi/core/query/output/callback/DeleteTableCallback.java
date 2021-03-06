/*
 * Copyright (c) 2005 - 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.wso2.siddhi.core.query.output.callback;

import org.wso2.siddhi.core.event.ComplexEventChunk;
import org.wso2.siddhi.core.event.stream.StreamEvent;
import org.wso2.siddhi.core.util.finder.Finder;
import org.wso2.siddhi.core.table.EventTable;

public class DeleteTableCallback implements OutputCallback {
    private EventTable eventTable;
    private Finder finder;

    public DeleteTableCallback(EventTable eventTable, Finder finder) {
        this.eventTable = eventTable;
        this.finder = finder;
    }

    @Override
    public void send(ComplexEventChunk<StreamEvent> complexEventChunk) {
        eventTable.delete(complexEventChunk, finder);
    }

}
