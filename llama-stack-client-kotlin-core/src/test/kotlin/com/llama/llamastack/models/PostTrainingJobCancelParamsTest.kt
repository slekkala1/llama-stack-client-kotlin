// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingJobCancelParamsTest {

    @Test
    fun create() {
        PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build()
    }

    @Test
    fun body() {
        val params = PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build()

        val body = params._body()

        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }
}
