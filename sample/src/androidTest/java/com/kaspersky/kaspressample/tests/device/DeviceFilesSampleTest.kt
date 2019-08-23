package com.kaspersky.kaspressample.tests.device

import android.os.Environment
import android.support.test.runner.AndroidJUnit4
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

@RunWith(AndroidJUnit4::class)
class DeviceFilesSampleTest : TestCase() {

    companion object {
        private const val FILENAME = "file.txt"
    }

    @Test
    fun filesSampleTest() {
        before {
        }.after {
        }.run {
            step("Push file 'artifacts/file.txt' to device") {
                device.files.push(FILENAME, Environment.getExternalStorageDirectory().absolutePath)
                val file = File(Environment.getExternalStorageDirectory(), FILENAME)
                assertTrue(file.exists())
            }

            step("Delete pushed file") {
                val file = File(Environment.getExternalStorageDirectory(), FILENAME)
                device.files.remove(file.absolutePath)
                assertFalse(file.exists())
            }
        }
    }
}

