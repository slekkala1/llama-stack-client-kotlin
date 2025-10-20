// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoringFunctionRetrieveParamsTest {

    @Test
    fun create() {
        ScoringFunctionRetrieveParams.builder().scoringFnId("scoring_fn_id").build()
    }

    @Test
    fun pathParams() {
        val params = ScoringFunctionRetrieveParams.builder().scoringFnId("scoring_fn_id").build()

        assertThat(params._pathParam(0)).isEqualTo("scoring_fn_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
