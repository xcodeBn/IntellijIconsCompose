package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Multiplebreakpoints: ImageVector
    get() {
        if (_Multiplebreakpoints != null) return _Multiplebreakpoints!!

        _Multiplebreakpoints = ImageVector.Builder(
            name = "Multiplebreakpoints",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(4f, 3f)
                curveTo(4.88f, 1.04f, 6.32f, 0.00f, 8.00f, 0.00f)
                curveTo(10.21f, 0.00f, 12.00f, 1.79f, 12.00f, 4.00f)
                curveTo(12.00f, 5.68f, 10.96f, 7.12f, 9.49f, 7.71f)
                curveTo(9.35f, 4.90f, 7.10f, 2.65f, 4.29f, 2.51f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(4f, 3f)
                    curveTo(4.88f, 1.04f, 6.32f, 0.00f, 8.00f, 0.00f)
                    curveTo(10.21f, 0.00f, 12.00f, 1.79f, 12.00f, 4.00f)
                    curveTo(12.00f, 5.68f, 10.96f, 7.12f, 9.49f, 7.71f)
                    curveTo(9.35f, 4.90f, 7.10f, 2.65f, 4.29f, 2.51f)
                    close()
                }
            }
        }.build()

        return _Multiplebreakpoints!!
    }

private var _Multiplebreakpoints: ImageVector? = null

