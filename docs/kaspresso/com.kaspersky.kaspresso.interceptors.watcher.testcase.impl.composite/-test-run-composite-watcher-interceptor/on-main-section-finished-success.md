[kaspresso](../../index.md) / [com.kaspersky.kaspresso.interceptors.watcher.testcase.impl.composite](../index.md) / [TestRunCompositeWatcherInterceptor](index.md) / [onMainSectionFinishedSuccess](./on-main-section-finished-success.md)

# onMainSectionFinishedSuccess

`fun onMainSectionFinishedSuccess(testInfo: `[`TestInfo`](../../com.kaspersky.kaspresso.testcases.models.info/-test-info/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Overrides [TestRunWatcherInterceptor.onMainSectionFinishedSuccess](../../com.kaspersky.kaspresso.interceptors.watcher.testcase/-test-run-watcher-interceptor/on-main-section-finished-success.md)

Called on "main" section finishes with success, delegates the interception to [watcherInterceptors](#).

### Parameters

`testInfo` - the test info to pass to [watcherInterceptors](#).