/*
 * Copyright 1999-2020 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.api.naming.pojo;

import junit.framework.TestCase;
import org.junit.Test;

public class InstanceTest extends TestCase {

    @Test
    public void testCheckClusterNameFormat() {
        Instance instance = new Instance();
        instance.setClusterName("demo");
        assertEquals("demo", instance.getClusterName());
        try {
            instance.setClusterName("demo,demo1,demo2");
        } catch (Exception e) {
            assertEquals("cluster name can only have these characters: 0-9a-zA-Z-, current: demo,demo1,demo2", e.getMessage());
        }
    }
}