/*
 * Copyright 2007 Sascha Weinreuter
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

package org.intellij.plugins.relaxNG;

import org.intellij.plugins.testUtil.CopyFile;

/**
 * Created by IntelliJ IDEA.
 * User: sweinreuter
 * Date: 22.08.2007
 */
public class RngCompletionTest extends HighlightingTestBase {
  public String getTestDataPath() {
    return "completion/rng";
  }

  public void testCompleteRef1() throws Throwable {
    doTestCompletion("complete-ref-1.rng", new String[]{ "start.element" });
  }

  public void testCompleteRef2() throws Throwable {
    doTestCompletion("complete-ref-2.rng", new String[]{"start.element" });
  }

  @CopyFile("included.rng")
  public void testCompleteRef3() throws Throwable {
    doTestCompletion("complete-ref-3.rng", new String[]{ "included.start.element" });
  }

  public void testCompleteRef4() throws Throwable {
    doTestCompletion("complete-ref-4", "rng");
  }
}
