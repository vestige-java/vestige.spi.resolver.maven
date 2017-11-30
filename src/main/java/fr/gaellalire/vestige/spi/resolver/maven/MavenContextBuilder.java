/*
 * Copyright 2017 The Apache Software Foundation.
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

package fr.gaellalire.vestige.spi.resolver.maven;

/**
 * @author Gael Lalire
 */
public interface MavenContextBuilder {

    void addAdditionalRepository(String id, String layout, String url);

    ModifyDependencyRequest addModifyDependency(String groupId, String artifactId);

    ReplaceDependencyRequest addReplaceDependency(String groupId, String artifactId);

    void setSuperPomRepositoriesUsed(boolean superPomRepositoriesUsed);

    void setPomRepositoriesIgnored(boolean pomRepositoriesIgnored);

    MavenContext build();

}
