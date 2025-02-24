/*
 * Copyright 2017-2019 John A. De Goes and the ZIO Contributors
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

package zio.test.mock

import zio.{ IO, Promise, Ref, ZIO }
import zio.test.mock.MockException.{ InvalidArgumentsException, InvalidMethodException }

trait Mock {

  def invoke[R0, E0, A0, In](method: Method[In, A0], input: In): ZIO[R0, E0, A0]

  final def apply[R0, E0, A0](method: Method[Unit, A0]): ZIO[R0, E0, A0] =
    invoke(method, ())

  final def apply[R0, E0, A0, A](method: Method[A, A0], a: A): ZIO[R0, E0, A0] =
    invoke(method, a)

  final def apply[R0, E0, A0, A, B](method: Method[(A, B), A0], a: A, b: B): ZIO[R0, E0, A0] =
    invoke(method, (a, b))

  final def apply[R0, E0, A0, A, B, C](method: Method[(A, B, C), A0], a: A, b: B, c: C): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c))

  final def apply[R0, E0, A0, A, B, C, D](method: Method[(A, B, C, D), A0], a: A, b: B, c: C, d: D): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d))

  final def apply[R0, E0, A0, A, B, C, D, E](
    method: Method[(A, B, C, D, E), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e))

  final def apply[R0, E0, A0, A, B, C, D, E, F](
    method: Method[(A, B, C, D, E, F), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G](
    method: Method[(A, B, C, D, E, F, G), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H](
    method: Method[(A, B, C, D, E, F, G, H), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I](
    method: Method[(A, B, C, D, E, F, G, H, I), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J](
    method: Method[(A, B, C, D, E, F, G, H, I, J), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P,
    q: Q
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P,
    q: Q,
    r: R
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P,
    q: Q,
    r: R,
    s: S
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P,
    q: Q,
    r: R,
    s: S,
    t: T
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P,
    q: Q,
    r: R,
    s: S,
    t: T,
    u: U
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u))

  final def apply[R0, E0, A0, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V](
    method: Method[(A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V), A0],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    g: G,
    h: H,
    i: I,
    j: J,
    k: K,
    l: L,
    m: M,
    n: N,
    o: O,
    p: P,
    q: Q,
    r: R,
    s: S,
    t: T,
    u: U,
    v: V
  ): ZIO[R0, E0, A0] =
    invoke(method, (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v))
}

object Mock {

  protected[mock] def make(mockedCallsRef: Ref[List[MockSpec.MockedCall[Any, Any, Any, Any]]]) =
    new Mock {
      def invoke[R0, E0, A0, A](invokedMethod: Method[A, A0], args: A): ZIO[R0, E0, A0] =
        for {
          promise <- Promise.make[E0, A0]
          _ <- mockedCallsRef
                .modify[Option[MockSpec.MockedCall[Any, Any, Any, Any]]] {
                  case (head :: tail) => Some(head) -> tail
                  case x              => None       -> x
                }
                .flatMap {
                  case Some(MockSpec.MockedCall(expectation @ Expectation(method, assertion), returns)) =>
                    if (invokedMethod != method)
                      ZIO.die(InvalidMethodException(invokedMethod.asInstanceOf[Method[Any, Any]], expectation))
                    else if (!assertion.test(args)) ZIO.die(InvalidArgumentsException(invokedMethod, args, assertion))
                    else promise.completeWith(returns(args).asInstanceOf[IO[E0, A0]])
                  case None => ZIO.die(new IllegalStateException)
                }
          output <- promise.await
        } yield output
    }
}
