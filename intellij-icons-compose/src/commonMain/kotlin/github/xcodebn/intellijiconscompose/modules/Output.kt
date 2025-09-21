package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Output: ImageVector
    get() {
        if (_Output != null) return _Output!!

        _Output = ImageVector.Builder(
            name = "Output",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(2f, 1f)
                curveTo(1.29f, 1.00f, 1.00f, 1.54f, 1.00f, 2.50f)
                curveTo(1.00f, 3.46f, 1.28f, 4.00f, 2.00f, 4.00f)
                curveTo(2.71f, 4.00f, 3.00f, 3.45f, 3.00f, 2.50f)
                curveTo(3.00f, 1.55f, 2.71f, 1.00f, 2.00f, 1.00f)
                close()
                moveTo(2f, -0f)
                curveTo(3.21f, -0.00f, 4.00f, 1.12f, 4.00f, 2.50f)
                curveTo(4.00f, 3.88f, 3.21f, 5.00f, 2.00f, 5.00f)
                curveTo(0.79f, 5.00f, 0.00f, 3.88f, 0.00f, 2.50f)
                curveTo(0.00f, 0.96f, 0.79f, -0.00f, 2.00f, -0.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(1f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 1f)
                lineTo(1f, 1f)
                lineTo(1f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 0f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(2f, 1f)
                    curveTo(1.29f, 1.00f, 1.00f, 1.54f, 1.00f, 2.50f)
                    curveTo(1.00f, 3.46f, 1.28f, 4.00f, 2.00f, 4.00f)
                    curveTo(2.71f, 4.00f, 3.00f, 3.45f, 3.00f, 2.50f)
                    curveTo(3.00f, 1.55f, 2.71f, 1.00f, 2.00f, 1.00f)
                    close()
                    moveTo(2f, -0f)
                    curveTo(3.21f, -0.00f, 4.00f, 1.12f, 4.00f, 2.50f)
                    curveTo(4.00f, 3.88f, 3.21f, 5.00f, 2.00f, 5.00f)
                    curveTo(0.79f, 5.00f, 0.00f, 3.88f, 0.00f, 2.50f)
                    curveTo(0.00f, 0.96f, 0.79f, -0.00f, 2.00f, -0.00f)
                    close()
                }
            }
        }.build()

        return _Output!!
    }

private var _Output: ImageVector? = null

