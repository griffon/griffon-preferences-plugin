/*
 * Copyright 2012-2013 the original author or authors.
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

package org.codehaus.griffon.runtime.prefs.factories;

import griffon.core.GriffonApplication;
import griffon.plugins.preferences.PreferencesManager;
import griffon.plugins.preferences.factories.PreferencesManagerFactory;
import org.codehaus.griffon.runtime.prefs.DefaultPreferencesManager;

/**
 * Default implementation of the {@code PreferencesManagerFactory} interface.
 *
 * @author Andres Almiray
 */
public class DefaultPreferencesManagerFactory implements PreferencesManagerFactory {
    public PreferencesManager create(GriffonApplication app) {
        return new DefaultPreferencesManager(app);
    }
}
