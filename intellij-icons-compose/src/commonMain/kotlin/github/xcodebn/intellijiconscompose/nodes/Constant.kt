package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Constant: ImageVector
    get() {
        if (_Constant != null) return _Constant!!

        _Constant = ImageVector.Builder(
            name = "Constant",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(5f, 4f)
                curveTo(4.53f, 4.74f, 4.03f, 4.98f, 3.10f, 5.00f)
                curveTo(2.06f, 5.02f, 1.00f, 4.28f, 1.00f, 3.00f)
                curveTo(1.00f, 1.71f, 1.97f, 1.00f, 3.10f, 1.00f)
                curveTo(3.95f, 1.00f, 4.55f, 1.18f, 4.90f, 1.55f)
                lineTo(6f, 1f)
                curveTo(4.83f, 0.27f, 4.29f, 0.00f, 3.10f, 0.00f)
                curveTo(1.34f, 0.00f, 0.00f, 1.36f, 0.00f, 3.00f)
                curveTo(0.00f, 4.68f, 1.36f, 6.00f, 3.00f, 6.00f)
                curveTo(4.29f, 6.00f, 5.02f, 5.59f, 5.62f, 4.98f)
                curveTo(5.21f, 4.52f, 5.00f, 4.28f, 5.00f, 4.28f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(5f, 4f)
                    curveTo(4.53f, 4.74f, 4.03f, 4.98f, 3.10f, 5.00f)
                    curveTo(2.06f, 5.02f, 1.00f, 4.28f, 1.00f, 3.00f)
                    curveTo(1.00f, 1.71f, 1.97f, 1.00f, 3.10f, 1.00f)
                    curveTo(3.95f, 1.00f, 4.55f, 1.18f, 4.90f, 1.55f)
                    lineTo(6f, 1f)
                    curveTo(4.83f, 0.27f, 4.29f, 0.00f, 3.10f, 0.00f)
                    curveTo(1.34f, 0.00f, 0.00f, 1.36f, 0.00f, 3.00f)
                    curveTo(0.00f, 4.68f, 1.36f, 6.00f, 3.00f, 6.00f)
                    curveTo(4.29f, 6.00f, 5.02f, 5.59f, 5.62f, 4.98f)
                    curveTo(5.21f, 4.52f, 5.00f, 4.28f, 5.00f, 4.28f)
                    close()
                }
            }
        }.build()

        return _Constant!!
    }

private var _Constant: ImageVector? = null

