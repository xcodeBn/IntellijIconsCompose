package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Annotation: ImageVector
    get() {
        if (_Annotation != null) return _Annotation!!

        _Annotation = ImageVector.Builder(
            name = "Annotation",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(15f, 11f)
                lineTo(14f, 8f)
                lineTo(11f, 8f)
                lineTo(9f, 13f)
                lineTo(1f, 13f)
                lineTo(1f, 2f)
                curveTo(1.00f, 2.04f, 1.01f, 2.02f, 1.05f, 2.00f)
                lineTo(5f, 2f)
                curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                lineTo(8f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(4f, 4f)
                lineTo(3f, 2f)
                lineTo(3f, 4f)
                lineTo(4f, 4f)
                close()
                moveTo(3f, 0f)
                lineTo(4f, 0f)
                lineTo(7f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 7f)
                lineTo(0f, 7f)
                lineTo(3f, 0f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(15f, 11f)
                    lineTo(14f, 8f)
                    lineTo(11f, 8f)
                    lineTo(9f, 13f)
                    lineTo(1f, 13f)
                    lineTo(1f, 2f)
                    curveTo(1.00f, 2.04f, 1.01f, 2.02f, 1.05f, 2.00f)
                    lineTo(5f, 2f)
                    curveTo(5.62f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                    lineTo(8f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 11f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(4f, 4f)
                    lineTo(3f, 2f)
                    lineTo(3f, 4f)
                    lineTo(4f, 4f)
                    close()
                    moveTo(3f, 0f)
                    lineTo(4f, 0f)
                    lineTo(7f, 7f)
                    lineTo(5f, 7f)
                    lineTo(5f, 6f)
                    lineTo(2f, 6f)
                    lineTo(2f, 7f)
                    lineTo(0f, 7f)
                    lineTo(3f, 0f)
                    close()
                }
            }
        }.build()

        return _Annotation!!
    }

private var _Annotation: ImageVector? = null

