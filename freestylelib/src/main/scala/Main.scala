/*
 * Copyright 2017-2018 47 Degrees, LLC. <http://www.47deg.com>
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

package freestyleLib

import cats.implicits._

import freestyle.free._
import freestyle.free.implicits._
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await

import freestyleLib.algebra._
import freestyleLib.algebra.implicits._

object Main extends App {

  def program[F[_]: AlgebraM]: FreeS[F, String] =
    AlgebraM[F].hello

  println(Await.result(program[AlgebraM.Op].interpret[Future], Duration.Inf))
}