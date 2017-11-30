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

import fr.gaellalire.vestige.spi.job.JobHelper;
import fr.gaellalire.vestige.spi.resolver.ResolvedClassLoaderConfiguration;
import fr.gaellalire.vestige.spi.resolver.ResolverException;
import fr.gaellalire.vestige.spi.resolver.Scope;

/**
 * @author Gael Lalire
 */
public interface ResolveMavenArtifactRequest {

    void addModifyScope(String groupId, String artifactId, Scope scope);

    void setNamedModuleActivated(boolean namedModuleActivated);

    void addReads(String source, String target);

    void addExports(String source, String pn, String target);

    void addOpens(String source, String pn, String target);

    ResolvedClassLoaderConfiguration execute(JobHelper jobHelper) throws ResolverException;

}
