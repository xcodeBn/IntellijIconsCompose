package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReplaceDark: ImageVector
    get() {
        if (_ReplaceDark != null) return _ReplaceDark!!

        _ReplaceDark = ImageVector.Builder(
            name = "ReplaceDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(1f, 7f)
                curveTo(1.00f, 6.92f, 1.00f, 6.83f, 1.00f, 6.75f)
                curveTo(1.00f, 3.57f, 3.57f, 1.00f, 6.75f, 1.00f)
                curveTo(9.93f, 1.00f, 12.50f, 3.57f, 12.50f, 6.75f)
                curveTo(12.50f, 9.50f, 10.57f, 11.79f, 8.00f, 12.36f)
                lineTo(8f, 10f)
                curveTo(9.46f, 9.77f, 10.50f, 8.38f, 10.50f, 6.75f)
                curveTo(10.50f, 4.68f, 8.82f, 3.00f, 6.75f, 3.00f)
                curveTo(4.68f, 3.00f, 3.00f, 4.68f, 3.00f, 6.75f)
                curveTo(3.00f, 6.83f, 3.00f, 6.92f, 3.01f, 7.00f)
                lineTo(1f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 13f)
                lineTo(5f, 13f)
                lineTo(4f, 10f)
                lineTo(4f, 10f)
                lineTo(3f, 13f)
                close()
                moveTo(3f, 8f)
                lineTo(5f, 8f)
                lineTo(8f, 16f)
                lineTo(6f, 16f)
                lineTo(5f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 16f)
                lineTo(0f, 16f)
                lineTo(3f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(1f, 7f)
                    curveTo(1.00f, 6.92f, 1.00f, 6.83f, 1.00f, 6.75f)
                    curveTo(1.00f, 3.57f, 3.57f, 1.00f, 6.75f, 1.00f)
                    curveTo(9.93f, 1.00f, 12.50f, 3.57f, 12.50f, 6.75f)
                    curveTo(12.50f, 9.50f, 10.57f, 11.79f, 8.00f, 12.36f)
                    lineTo(8f, 10f)
                    curveTo(9.46f, 9.77f, 10.50f, 8.38f, 10.50f, 6.75f)
                    curveTo(10.50f, 4.68f, 8.82f, 3.00f, 6.75f, 3.00f)
                    curveTo(4.68f, 3.00f, 3.00f, 4.68f, 3.00f, 6.75f)
                    curveTo(3.00f, 6.83f, 3.00f, 6.92f, 3.01f, 7.00f)
                    lineTo(1f, 7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 13f)
                    lineTo(5f, 13f)
                    lineTo(4f, 10f)
                    lineTo(4f, 10f)
                    lineTo(3f, 13f)
                    close()
                    moveTo(3f, 8f)
                    lineTo(5f, 8f)
                    lineTo(8f, 16f)
                    lineTo(6f, 16f)
                    lineTo(5f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 16f)
                    lineTo(0f, 16f)
                    lineTo(3f, 8f)
                    close()
                }
            }
        }.build()

        return _ReplaceDark!!
    }

private var _ReplaceDark: ImageVector? = null

