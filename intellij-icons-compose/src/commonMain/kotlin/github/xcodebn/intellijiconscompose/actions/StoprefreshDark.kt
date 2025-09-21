package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StoprefreshDark: ImageVector
    get() {
        if (_StoprefreshDark != null) return _StoprefreshDark!!

        _StoprefreshDark = ImageVector.Builder(
            name = "StoprefreshDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 14f)
                curveTo(7.90f, 14.00f, 7.79f, 14.00f, 7.68f, 14.00f)
                curveTo(4.73f, 13.84f, 2.39f, 11.57f, 2.04f, 8.73f)
                lineTo(4f, 9f)
                curveTo(4.29f, 10.70f, 5.85f, 12.09f, 7.78f, 12.19f)
                curveTo(7.85f, 12.20f, 7.93f, 12.20f, 8.00f, 12.20f)
                lineTo(8f, 14f)
                close()
                moveTo(4f, 4f)
                curveTo(4.80f, 2.65f, 6.48f, 1.92f, 8.31f, 2.01f)
                curveTo(11.23f, 2.17f, 13.55f, 4.38f, 13.94f, 7.16f)
                lineTo(12f, 7f)
                curveTo(11.65f, 5.25f, 10.12f, 3.91f, 8.22f, 3.81f)
                curveTo(6.92f, 3.74f, 5.73f, 4.27f, 4.91f, 5.16f)
                lineTo(7f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 2f)
                lineTo(4f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(8f, 14f)
                    curveTo(7.90f, 14.00f, 7.79f, 14.00f, 7.68f, 14.00f)
                    curveTo(4.73f, 13.84f, 2.39f, 11.57f, 2.04f, 8.73f)
                    lineTo(4f, 9f)
                    curveTo(4.29f, 10.70f, 5.85f, 12.09f, 7.78f, 12.19f)
                    curveTo(7.85f, 12.20f, 7.93f, 12.20f, 8.00f, 12.20f)
                    lineTo(8f, 14f)
                    close()
                    moveTo(4f, 4f)
                    curveTo(4.80f, 2.65f, 6.48f, 1.92f, 8.31f, 2.01f)
                    curveTo(11.23f, 2.17f, 13.55f, 4.38f, 13.94f, 7.16f)
                    lineTo(12f, 7f)
                    curveTo(11.65f, 5.25f, 10.12f, 3.91f, 8.22f, 3.81f)
                    curveTo(6.92f, 3.74f, 5.73f, 4.27f, 4.91f, 5.16f)
                    lineTo(7f, 7f)
                    lineTo(2f, 7f)
                    lineTo(2f, 2f)
                    lineTo(4f, 4f)
                    close()
                }
            }
        }.build()

        return _StoprefreshDark!!
    }

private var _StoprefreshDark: ImageVector? = null

