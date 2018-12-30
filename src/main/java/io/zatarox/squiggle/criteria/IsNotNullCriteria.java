/*
 * Copyright 2004-2019 Joe Walnes, Guillaume Chauvet, Egor Nepomnyaschih.
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
package io.zatarox.squiggle.criteria;

import io.zatarox.squiggle.Criteria;
import io.zatarox.squiggle.Matchable;
import io.zatarox.squiggle.Output;
import io.zatarox.squiggle.TableReference;

import java.util.Set;

public class IsNotNullCriteria implements Criteria {

    private final Matchable value;

    public IsNotNullCriteria(Matchable value) {
        this.value = value;
    }

    @Override
    public void write(Output output) {
        output.write(value).write(" IS NOT NULL");
    }

    @Override
    public void collectTableReferences(Set<TableReference> tableReferences) {
        value.collectTableReferences(tableReferences);
    }
}
