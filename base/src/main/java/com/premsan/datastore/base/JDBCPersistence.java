/*
 * Copyright (c) PREMSAN
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
 */
package com.premsan.datastore.base;

import java.sql.Connection;

public class JDBCPersistence implements Persistence {

    private final Connection connection;

    public JDBCPersistence(final Connection connection) {

        this.connection = connection;
    }

    @Override
    public Model getModel(final String id, final Integer version) {

        return null;
    }

    @Override
    public void putModel(final Model model) {}

    @Override
    public void removeModel(final String id, final Integer version) {}

    @Override
    public ModelInstance getModelInstance(final String id) {

        return null;
    }

    @Override
    public void putModelInstance(final ModelInstance modelInstance) {}

    @Override
    public void removeModelInstance(final String id) {}
}
