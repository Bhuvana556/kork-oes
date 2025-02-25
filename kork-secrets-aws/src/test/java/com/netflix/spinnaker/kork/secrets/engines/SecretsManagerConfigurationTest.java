/*
 * Copyright 2022 Apple, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.kork.secrets.engines;

import static org.junit.jupiter.api.Assertions.*;

import com.netflix.spinnaker.kork.secrets.SecretConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SecretConfiguration.class)
@RequiredArgsConstructor
class SecretsManagerConfigurationTest {
  @Autowired SecretsManagerSecretEngine engine;

  /*
   //commented for PR3 porting
  @Test
  void contextLoads() {
    assertNotNull(engine);
  } */
}
