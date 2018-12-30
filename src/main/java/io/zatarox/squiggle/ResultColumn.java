/*
 * Copyright 2019 Egor Nepomnyaschih.
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
package io.zatarox.squiggle;

import java.util.Set;

public class ResultColumn implements Outputable, TableReference {

    private final Selectable selectable;
    private final String alias;

    ResultColumn(Selectable selectable, String alias) {
        this.selectable = selectable;
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public void write(Output output) {
        output.write(selectable).write(" as ").write(alias);
    }

    @Override
    public void addReferencedTableAccessorsTo(Set<TableAccessor> tableAccessors) {
        selectable.addReferencedTableAccessorsTo(tableAccessors);
    }
}
