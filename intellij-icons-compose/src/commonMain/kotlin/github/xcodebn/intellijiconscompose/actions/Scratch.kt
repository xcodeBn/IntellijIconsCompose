package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scratch: ImageVector
    get() {
        if (_Scratch != null) return _Scratch!!

        _Scratch = ImageVector.Builder(
            name = "Scratch",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(13f, 4f)
                lineTo(13f, 2f)
                lineTo(12f, 2f)
                lineTo(12f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 4f)
                lineTo(13f, 5f)
                lineTo(14f, 5f)
                lineTo(13f, 4f)
                close()
                moveTo(12f, 7f)
                curveTo(10.57f, 7.00f, 9.00f, 5.43f, 9.00f, 3.50f)
                curveTo(9.00f, 1.57f, 10.57f, 0.00f, 12.50f, 0.00f)
                curveTo(14.43f, 0.00f, 16.00f, 1.57f, 16.00f, 3.50f)
                curveTo(16.00f, 5.43f, 14.43f, 7.00f, 12.50f, 7.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(13f, 4f)
                    lineTo(13f, 2f)
                    lineTo(12f, 2f)
                    lineTo(12f, 4f)
                    lineTo(12f, 4f)
                    lineTo(12f, 4f)
                    lineTo(13f, 5f)
                    lineTo(14f, 5f)
                    lineTo(13f, 4f)
                    close()
                    moveTo(12f, 7f)
                    curveTo(10.57f, 7.00f, 9.00f, 5.43f, 9.00f, 3.50f)
                    curveTo(9.00f, 1.57f, 10.57f, 0.00f, 12.50f, 0.00f)
                    curveTo(14.43f, 0.00f, 16.00f, 1.57f, 16.00f, 3.50f)
                    curveTo(16.00f, 5.43f, 14.43f, 7.00f, 12.50f, 7.00f)
                    close()
                }
            }
        }.build()

        return _Scratch!!
    }

private var _Scratch: ImageVector? = null

