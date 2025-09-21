package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Copyoffolder: ImageVector
    get() {
        if (_Copyoffolder != null) return _Copyoffolder!!

        _Copyoffolder = ImageVector.Builder(
            name = "Copyoffolder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 14f)
                lineTo(13f, 14f)
                lineTo(13f, 6f)
                lineTo(8f, 6f)
                lineTo(7f, 5f)
                curveTo(6.22f, 4.29f, 5.64f, 4.03f, 5.00f, 4.00f)
                lineTo(1f, 4f)
                lineTo(1f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(3f, 3f)
                lineTo(3f, 1f)
                lineTo(7f, 1f)
                curveTo(7.64f, 1.03f, 8.22f, 1.29f, 8.70f, 1.71f)
                lineTo(10f, 3f)
                lineTo(15f, 3f)
                lineTo(15f, 11f)
                lineTo(14f, 11f)
                lineTo(14f, 5f)
                lineTo(9f, 5f)
                lineTo(8f, 4f)
                curveTo(7.22f, 3.29f, 6.62f, 3.03f, 5.98f, 3.00f)
                lineTo(3f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(1f, 14f)
                    lineTo(13f, 14f)
                    lineTo(13f, 6f)
                    lineTo(8f, 6f)
                    lineTo(7f, 5f)
                    curveTo(6.22f, 4.29f, 5.64f, 4.03f, 5.00f, 4.00f)
                    lineTo(1f, 4f)
                    lineTo(1f, 14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(3f, 3f)
                    lineTo(3f, 1f)
                    lineTo(7f, 1f)
                    curveTo(7.64f, 1.03f, 8.22f, 1.29f, 8.70f, 1.71f)
                    lineTo(10f, 3f)
                    lineTo(15f, 3f)
                    lineTo(15f, 11f)
                    lineTo(14f, 11f)
                    lineTo(14f, 5f)
                    lineTo(9f, 5f)
                    lineTo(8f, 4f)
                    curveTo(7.22f, 3.29f, 6.62f, 3.03f, 5.98f, 3.00f)
                    lineTo(3f, 3f)
                    close()
                }
            }
        }.build()

        return _Copyoffolder!!
    }

private var _Copyoffolder: ImageVector? = null

