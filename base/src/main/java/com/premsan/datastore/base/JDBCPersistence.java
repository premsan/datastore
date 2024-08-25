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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPersistence implements Persistence {

    private static final String GET_MODEL_SQL =
            "SELECT * FROM MODELS WHERE name = ? AND version = ?";

    private final Connection connection;

    public JDBCPersistence(final Connection connection) {

        this.connection = connection;
    }

    @Override
    public Model getModel(final String name, final Integer version) {

        try {
            final PreparedStatement preparedStatement = connection.prepareStatement(GET_MODEL_SQL);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, version);

            final ResultSet resultSet = preparedStatement.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void putModel(final Model model) {}

    @Override
    public void removeModel(final String name, final Integer version) {}

    @Override
    public ModelInstance getModelInstance(final String id) {

        return null;
    }

    @Override
    public void putModelInstance(final ModelInstance modelInstance) {}

    @Override
    public void removeModelInstance(final String id) {}
}
