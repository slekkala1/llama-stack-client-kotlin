// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

package com.llama.llamastack.core

import com.llama.llamastack.core.http.HttpRequest

internal fun HttpRequest.prepare(clientOptions: ClientOptions, params: Params): HttpRequest =
    toBuilder()
        .putAllQueryParams(clientOptions.queryParams)
        .replaceAllQueryParams(params._queryParams())
        .putAllHeaders(clientOptions.headers)
        .replaceAllHeaders(params._headers())
        .build()

internal suspend fun HttpRequest.prepareAsync(clientOptions: ClientOptions, params: Params) =
    // This async version exists to make it easier to add async specific preparation logic in the
    // future.
    prepare(clientOptions, params)
