/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.copycat.client.response;

/**
 * Session response.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public abstract class SessionResponse<T extends SessionResponse<T>> extends AbstractResponse<T> {

  /**
   * Session response builder.
   */
  public static abstract class Builder<T extends Builder<T, U>, U extends SessionResponse<U>> extends AbstractResponse.Builder<T, U> {
    protected Builder(U response) {
      super(response);
    }
  }

}
