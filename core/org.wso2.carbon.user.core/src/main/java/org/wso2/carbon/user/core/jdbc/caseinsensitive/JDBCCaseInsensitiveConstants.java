/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.user.core.jdbc.caseinsensitive;

public class JDBCCaseInsensitiveConstants {
    public static final String SELECT_USER_CASE_INSENSITIVE = "SelectUserSQLCaseInsensitive";
    public static final String GET_USER_FILTER_CASE_INSENSITIVE = "UserFilterSQLCaseInsensitive";
    public static final String GET_USER_ROLE_CASE_INSENSITIVE = "UserRoleSQLCaseInsensitive";
    public static final String GET_SHARED_ROLES_FOR_USER_CASE_INSENSITIVE = "UserSharedRoleSQLCaseInsensitive";
    public static final String GET_IS_USER_EXISTING_CASE_INSENSITIVE = "IsUserExistingSQLCaseInsensitive";
    public static final String GET_PROPS_FOR_PROFILE_CASE_INSENSITIVE = "GetUserPropertiesForProfileSQLCaseInsensitive";
    public static final String GET_PROP_FOR_PROFILE_CASE_INSENSITIVE = "GetUserPropertyForProfileSQLCaseInsensitive";
    public static final String GET_PROFILE_NAMES_FOR_USER_CASE_INSENSITIVE = "GetUserProfileNamesSQLCaseInsensitive";
    public static final String GET_USERID_FROM_USERNAME_CASE_INSENSITIVE = "GetUserIDFromUserNameSQLCaseInsensitive";
    public static final String GET_TENANT_ID_FROM_USERNAME_CASE_INSENSITIVE =
            "GetTenantIDFromUserNameSQLCaseInsensitive";
    public static final String ADD_USER_TO_ROLE_CASE_INSENSITIVE = "AddUserToRoleSQLCaseInsensitive";
    public static final String ADD_ROLE_TO_USER_CASE_INSENSITIVE = "AddRoleToUserSQLCaseInsensitive";
    public static final String ADD_SHARED_ROLE_TO_USER_CASE_INSENSITIVE = "AddSharedRoleToUserSQLCaseInsensitive";
    public static final String REMOVE_USER_FROM_ROLE_CASE_INSENSITIVE = "RemoveUserFromRoleSQLCaseInsensitive";
    public static final String REMOVE_USER_FROM_SHARED_ROLE_CASE_INSENSITIVE =
            "RemoveUserFromSharedRoleSQLCaseInsensitive";
    public static final String REMOVE_ROLE_FROM_USER_CASE_INSENSITIVE = "RemoveRoleFromUserSQLCaseInsensitive";
    public static final String DELETE_USER_CASE_INSENSITIVE = "DeleteUserSQLCaseInsensitive";
    public static final String ON_DELETE_USER_REMOVE_USER_ROLE_CASE_INSENSITIVE =
            "OnDeleteUserRemoveUserRoleMappingSQLCaseInsensitive";
    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE_CASE_INSENSITIVE =
            "OnDeleteUserRemoveUserAttributeSQLCaseInsensitive";
    public static final String UPDATE_USER_PASSWORD_CASE_INSENSITIVE = "UpdateUserPasswordSQLCaseInsensitive";
    public static final String UPDATE_USER_PROPERTY_CASE_INSENSITIVE = "UpdateUserPropertySQLCaseInsensitive";
    public static final String DELETE_USER_PROPERTY_CASE_INSENSITIVE = "DeleteUserPropertySQLCaseInsensitive";
    public static final String USER_NAME_UNIQUE_CASE_INSENSITIVE = "UserNameUniqueAcrossTenantsSQLCaseInsensitive";
    public static final String SELECT_USER_SQL_CASE_INSENSITIVE = "SELECT * FROM UM_USER WHERE LOWER(UM_USER_NAME)" +
            "=LOWER(?) AND UM_TENANT_ID=?";
    public static final String GET_USER_FILTER_SQL_CASE_INSENSITIVE = "SELECT UM_USER_NAME FROM UM_USER WHERE LOWER" +
            "(UM_USER_NAME) LIKE LOWER(?) AND UM_TENANT_ID=? ORDER BY UM_USER_NAME";
    public static final String GET_USER_ROLE_SQL_CASE_INSENSITIVE = "SELECT UM_ROLE_NAME FROM UM_USER_ROLE, UM_ROLE, " +
            "UM_USER WHERE LOWER(UM_USER.UM_USER_NAME)=LOWER(?) AND UM_USER.UM_ID=UM_USER_ROLE.UM_USER_ID AND UM_ROLE" +
            ".UM_ID=UM_USER_ROLE.UM_ROLE_ID AND UM_USER_ROLE.UM_TENANT_ID=? AND UM_ROLE.UM_TENANT_ID=? AND UM_USER" +
            ".UM_TENANT_ID=?";
    public static final String GET_SHARED_ROLES_FOR_USER_SQL_CASE_INSENSITIVE = "SELECT UM_ROLE_NAME, UM_ROLE" +
            ".UM_TENANT_ID, UM_SHARED_ROLE FROM UM_SHARED_USER_ROLE INNER JOIN UM_USER ON UM_SHARED_USER_ROLE" +
            ".UM_USER_ID = UM_USER.UM_ID INNER JOIN UM_ROLE ON UM_SHARED_USER_ROLE.UM_ROLE_ID = UM_ROLE.UM_ID WHERE " +
            "LOWER(UM_USER.UM_USER_NAME) = LOWER(?) AND UM_SHARED_USER_ROLE.UM_USER_TENANT_ID = UM_USER.UM_TENANT_ID " +
            "AND UM_SHARED_USER_ROLE.UM_ROLE_TENANT_ID = UM_ROLE.UM_TENANT_ID AND UM_SHARED_USER_ROLE" +
            ".UM_USER_TENANT_ID = ? ";
    public static final String GET_IS_USER_EXISTING_SQL_CASE_INSENSITIVE = "SELECT UM_ID FROM UM_USER WHERE " +
            "LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?";
    public static final String GET_PROPS_FOR_PROFILE_SQL_CASE_INSENSITIVE = "SELECT UM_ATTR_NAME, UM_ATTR_VALUE FROM " +
            "UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND LOWER(UM_USER" +
            ".UM_USER_NAME)=LOWER(?) AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND UM_USER" +
            ".UM_TENANT_ID=?";
    public static final String GET_PROP_FOR_PROFILE_SQL_CASE_INSENSITIVE = "SELECT UM_ATTR_VALUE FROM " +
            "UM_USER_ATTRIBUTE, UM_USER WHERE UM_USER.UM_ID = UM_USER_ATTRIBUTE.UM_USER_ID AND LOWER(UM_USER" +
            ".UM_USER_NAME)=LOWER(?) AND UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_USER_ATTRIBUTE.UM_TENANT_ID=? AND " +
            "UM_USER.UM_TENANT_ID=?";
    public static final String GET_PROFILE_NAMES_FOR_USER_SQL_CASE_INSENSITIVE = "SELECT DISTINCT UM_PROFILE_ID FROM " +
            "UM_USER_ATTRIBUTE WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND " +
            "UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String GET_USERID_FROM_USERNAME_SQL_CASE_INSENSITIVE = "SELECT UM_ID FROM UM_USER WHERE " +
            "LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?";
    public static final String GET_TENANT_ID_FROM_USERNAME_SQL_CASE_INSENSITIVE = "SELECT UM_TENANT_ID FROM UM_USER " +
            "WHERE LOWER(UM_USER_NAME)=LOWER(?)";
    public static final String ADD_USER_TO_ROLE_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ROLE (UM_USER_ID, " +
            "UM_ROLE_ID, UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND " +
            "UM_TENANT_ID=?),(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?), ?)";
    public static final String ADD_ROLE_TO_USER_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ROLE (UM_ROLE_ID, " +
            "UM_USER_ID, UM_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?)," +
            "(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?), ?)";
    public static final String ADD_SHARED_ROLE_TO_USER_SQL_CASE_INSENSITIVE = "INSERT INTO UM_SHARED_USER_ROLE " +
            "(UM_ROLE_ID, UM_USER_ID, UM_USER_TENANT_ID, UM_ROLE_TENANT_ID) VALUES ((SELECT UM_ID FROM UM_ROLE WHERE " +
            "UM_ROLE_NAME=? AND UM_TENANT_ID=?), (SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND " +
            "UM_TENANT_ID=?), ?, ?)";
    public static final String REMOVE_USER_FROM_SHARED_ROLE_SQL_CASE_INSENSITIVE = "DELETE FROM UM_SHARED_USER_ROLE " +
            "WHERE UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_USER_ID=" +
            "(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?) AND " +
            "UM_USER_TENANT_ID=? AND UM_ROLE_TENANT_ID = ?";
    public static final String REMOVE_USER_FROM_ROLE_SQL_CASE_INSENSITIVE = "DELETE FROM UM_USER_ROLE WHERE " +
            "UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?) AND " +
            "UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String REMOVE_ROLE_FROM_USER_SQL_CASE_INSENSITIVE = "DELETE FROM UM_USER_ROLE WHERE " +
            "UM_ROLE_ID=(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?) AND UM_USER_ID=(SELECT " +
            "UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?) AND UM_TENANT_ID=?";
    public static final String DELETE_USER_SQL_CASE_INSENSITIVE = "DELETE FROM UM_USER WHERE LOWER(UM_USER_NAME) = " +
            "LOWER(?) AND UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_REMOVE_USER_ROLE_SQL_CASE_INSENSITIVE = "DELETE FROM UM_USER_ROLE WHERE" +
            " UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?) AND " +
            "UM_TENANT_ID=?";
    public static final String ON_DELETE_USER_REMOVE_ATTRIBUTE_SQL_CASE_INSENSITIVE = "DELETE FROM UM_USER_ATTRIBUTE " +
            "WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?) AND " +
            "UM_TENANT_ID=?";
    public static final String UPDATE_USER_PASSWORD_SQL_CASE_INSENSITIVE = "UPDATE UM_USER SET UM_USER_PASSWORD= ?, " +
            "UM_SALT_VALUE=?, UM_REQUIRE_CHANGE=?, UM_CHANGED_TIME=? WHERE LOWER(UM_USER_NAME)= LOWER(?) AND " +
            "UM_TENANT_ID=?";
    public static final String UPDATE_USER_PROPERTY_SQL_CASE_INSENSITIVE = "UPDATE UM_USER_ATTRIBUTE SET " +
            "UM_ATTR_VALUE=? WHERE UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND " +
            "UM_TENANT_ID=?) AND UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_TENANT_ID=?";
    public static final String DELETE_USER_PROPERTY_SQL_CASE_INSENSITIVE = "DELETE FROM UM_USER_ATTRIBUTE WHERE " +
            "UM_USER_ID=(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?) AND " +
            "UM_ATTR_NAME=? AND UM_PROFILE_ID=? AND UM_TENANT_ID=?";
    public static final String USER_NAME_UNIQUE_SQL_CASE_INSENSITIVE = "SELECT UM_ID FROM UM_USER WHERE " +
            "LOWER(UM_USER_NAME)=LOWER(?)";

    // mssql
    public static final String ADD_USER_TO_ROLE_MSSQL_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ROLE (UM_USER_ID, " +
            "UM_ROLE_ID, UM_TENANT_ID) SELECT (SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND " +
            "UM_TENANT_ID=?),(SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?),(?)";
    public static final String ADD_ROLE_TO_USER_MSSQL_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ROLE (UM_ROLE_ID, " +
            "UM_USER_ID, UM_TENANT_ID) SELECT (SELECT UM_ID FROM UM_ROLE WHERE UM_ROLE_NAME=? AND UM_TENANT_ID=?)," +
            "(SELECT UM_ID FROM UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?), (?)";
    public static final String ADD_USER_PROPERTY_MSSQL_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ATTRIBUTE " +
            "(UM_USER_ID, UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_TENANT_ID) SELECT (SELECT UM_ID FROM UM_USER" +
            " WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?), (?), (?), (?), (?)";
    public static final String ADD_USER_TO_ROLE_CASE_INSENSITIVE_MSSQL = "AddUserToRoleSQLCaseInsensitive-mssql";
    public static final String ADD_ROLE_TO_USER_CASE_INSENSITIVE_MSSQL = "AddRoleToUserSQLCaseInsensitive-mssql";
    public static final String ADD_USER_PROPERTY_CASE_INSENSITIVE_MSSQL = "AddUserPropertySQLCaseInsensitive-mssql";
    //openedge
    public static final String ADD_USER_TO_ROLE_OPENEDGE_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ROLE " +
            "(UM_USER_ID, UM_ROLE_ID, UM_TENANT_ID) SELECT UU.UM_ID, UR.UM_ID, ? FROM UM_USER UU, UM_ROLE UR WHERE " +
            "LOWER(UU.UM_USER_NAME)=LOWER(?) AND UU.UM_TENANT_ID=? AND UR.UM_ROLE_NAME=? AND UR.UM_TENANT_ID=?";
    public static final String ADD_ROLE_TO_USER_OPENEDGE_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ROLE " +
            "(UM_ROLE_ID, UM_USER_ID, UM_TENANT_ID) SELECT UR.UM_ID, UU.UM_ID, ? FROM UM_ROLE UR, UM_USER UU WHERE UR" +
            ".UM_ROLE_NAME=? AND UR.UM_TENANT_ID=? AND LOWER(UU.UM_USER_NAME)=LOWER(?) AND UU.UM_TENANT_ID=?";
    public static final String ADD_USER_PROPERTY_OPENEDGE_SQL_CASE_INSENSITIVE = "INSERT INTO UM_USER_ATTRIBUTE " +
            "(UM_USER_ID, UM_ATTR_NAME, UM_ATTR_VALUE, UM_PROFILE_ID, UM_TENANT_ID) SELECT UM_ID, ?, ?, ?, ? FROM " +
            "UM_USER WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_TENANT_ID=?";
    public static final String ADD_USER_TO_ROLE_CASE_INSENSITIVE_OPENEDGE = "AddUserToRoleSQLCaseInsensitive-openedge";
    public static final String ADD_ROLE_TO_USER_CASE_INSENSITIVE_OPENEDGE = "AddRoleToUserSQLCaseInsensitive-openedge";
    public static final String ADD_USER_PROPERTY_CASE_INSENSITIVE_OPENEDGE =
            "AddUserPropertySQLCaseInsensitive-openedge";

    //hybrid roles
    public static final String GET_ROLE_LIST_OF_USER_SQL_CASE_INSENSITIVE = "SELECT UM_ROLE_NAME FROM " +
            "UM_HYBRID_USER_ROLE, UM_HYBRID_ROLE WHERE LOWER(UM_USER_NAME)=LOWER(?) AND UM_HYBRID_USER_ROLE" +
            ".UM_ROLE_ID=UM_HYBRID_ROLE.UM_ID AND UM_HYBRID_USER_ROLE.UM_TENANT_ID=? AND UM_HYBRID_ROLE" +
            ".UM_TENANT_ID=? AND UM_HYBRID_USER_ROLE.UM_DOMAIN_ID=(SELECT UM_DOMAIN_ID FROM UM_DOMAIN WHERE " +
            "UM_TENANT_ID=? AND UM_DOMAIN_NAME=?)";


    public static final String CASE_SENSITIVE_USERNAME = "CaseInsensitiveUsername";
    public static final String CASE_SENSITIVE_USERNAME_DESCRIPTION = "Whether the username is case sensitive or not";

    private JDBCCaseInsensitiveConstants() {
    }
}
