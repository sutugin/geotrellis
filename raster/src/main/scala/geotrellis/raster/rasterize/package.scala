/*
 * Copyright 2016 Azavea
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

package geotrellis.raster

package object rasterize {

  /** Callback for given row and column (compatible with previous definition). */
  type Callback = (Int, Int) => Unit

  /**
    * A call back which accepts a col-row-fraction triple.  The
    * fraction is the fraction of the pixel which is covered by the
    * query object.
    */
  type FractionCallback = (Int, Int, Double) => Unit
}
