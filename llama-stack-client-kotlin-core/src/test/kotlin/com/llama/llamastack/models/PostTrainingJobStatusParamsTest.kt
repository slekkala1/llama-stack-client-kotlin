// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingJobStatusParamsTest {

    @Test
    fun create() {
        PostTrainingJobStatusParams.builder().jobUuid("job_uuid").build()
    }

    @Test
    fun queryParams() {
        val params = PostTrainingJobStatusParams.builder().jobUuid("job_uuid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("job_uuid", "job_uuid").build())
    }
}
