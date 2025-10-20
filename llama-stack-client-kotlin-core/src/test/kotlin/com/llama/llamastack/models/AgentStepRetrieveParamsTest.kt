// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentStepRetrieveParamsTest {

    @Test
    fun create() {
        AgentStepRetrieveParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .turnId("turn_id")
            .stepId("step_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentStepRetrieveParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .stepId("step_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("session_id")
        assertThat(params._pathParam(2)).isEqualTo("turn_id")
        assertThat(params._pathParam(3)).isEqualTo("step_id")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
