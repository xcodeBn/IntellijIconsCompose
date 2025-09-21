package github.xcodebn.intellijiconscompose.runconfigurations.teststate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Red2Dark: ImageVector
    get() {
        if (_Red2Dark != null) return _Red2Dark!!

        _Red2Dark = ImageVector.Builder(
            name = "Red2Dark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(9f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 9f)
                curveTo(5.53f, 8.91f, 5.03f, 9.00f, 4.51f, 9.00f)
                curveTo(2.02f, 9.00f, 0.00f, 6.99f, 0.00f, 4.50f)
                curveTo(0.00f, 2.01f, 2.02f, 0.00f, 4.51f, 0.00f)
                curveTo(6.84f, 0.00f, 8.75f, 1.75f, 9.00f, 4.00f)
                close()
                moveTo(4f, 2f)
                lineTo(4f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 2f)
                lineTo(4f, 2f)
                close()
                moveTo(4f, 6f)
                lineTo(4f, 8f)
                lineTo(5f, 8f)
                lineTo(5f, 6f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(7f, 5f)
                lineTo(12f, 8f)
                lineTo(7f, 12f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFC75450))
                ) {
                    moveTo(9f, 4f)
                    lineTo(6f, 4f)
                    lineTo(6f, 9f)
                    curveTo(5.53f, 8.91f, 5.03f, 9.00f, 4.51f, 9.00f)
                    curveTo(2.02f, 9.00f, 0.00f, 6.99f, 0.00f, 4.50f)
                    curveTo(0.00f, 2.01f, 2.02f, 0.00f, 4.51f, 0.00f)
                    curveTo(6.84f, 0.00f, 8.75f, 1.75f, 9.00f, 4.00f)
                    close()
                    moveTo(4f, 2f)
                    lineTo(4f, 4f)
                    lineTo(5f, 4f)
                    lineTo(5f, 2f)
                    lineTo(4f, 2f)
                    close()
                    moveTo(4f, 6f)
                    lineTo(4f, 8f)
                    lineTo(5f, 8f)
                    lineTo(5f, 6f)
                    lineTo(4f, 6f)
                    close()
                }
            }
        }.build()

        return _Red2Dark!!
    }

private var _Red2Dark: ImageVector? = null

