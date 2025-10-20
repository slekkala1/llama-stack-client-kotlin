// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSessionCreateResponseTest {

    @Test
    fun create() {
        val agentSessionCreateResponse =
            AgentSessionCreateResponse.builder().sessionId("session_id").build()

        assertThat(agentSessionCreateResponse.sessionId()).isEqualTo("session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentSessionCreateResponse =
            AgentSessionCreateResponse.builder().sessionId("session_id").build()

        val roundtrippedAgentSessionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentSessionCreateResponse),
                jacksonTypeRef<AgentSessionCreateResponse>(),
            )

        assertThat(roundtrippedAgentSessionCreateResponse).isEqualTo(agentSessionCreateResponse)
    }
}
