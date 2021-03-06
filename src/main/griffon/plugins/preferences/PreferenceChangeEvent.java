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

package griffon.plugins.preferences;

/**
 * @author Andres Almiray
 */
public class PreferenceChangeEvent {
    private final String path;
    private final String key;
    private Object oldValue;
    private Object newValue;

    public PreferenceChangeEvent(String path, String key, Object oldValue, Object newValue) {
        this.path = path;
        this.key = key;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public String getPath() {
        return path;
    }

    public String getKey() {
        return key;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PreferenceChangeEvent that = (PreferenceChangeEvent) o;

        if (!path.equals(that.path)) return false;
        if (!key.equals(that.key)) return false;
        if (newValue != null ? !newValue.equals(that.newValue) : that.newValue != null) return false;
        if (oldValue != null ? !oldValue.equals(that.oldValue) : that.oldValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = path.hashCode();
        result = 31 * result + key.hashCode();
        result = 31 * result + (oldValue != null ? oldValue.hashCode() : 0);
        result = 31 * result + (newValue != null ? newValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PreferenceChangeEvent{" +
            "path='" + path + '\'' +
            ", key='" + key + '\'' +
            ", oldValue=" + oldValue +
            ", newValue=" + newValue +
            '}';
    }
}
