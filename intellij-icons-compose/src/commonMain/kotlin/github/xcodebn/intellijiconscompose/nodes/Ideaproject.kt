package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ideaproject: ImageVector
    get() {
        if (_Ideaproject != null) return _Ideaproject!!

        _Ideaproject = ImageVector.Builder(
            name = "Ideaproject",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 13f)
                lineTo(9f, 13f)
                lineTo(9f, 9f)
                lineTo(15f, 9f)
                lineTo(15f, 4f)
                lineTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.22f, 2.29f, 5.62f, 2.03f, 4.98f, 2.00f)
                lineTo(1f, 2f)
                curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                lineTo(1f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(10f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 10f)
                lineTo(10f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE0E0E0))
            ) {
                moveTo(11f, 15f)
                lineTo(14f, 15f)
                lineTo(14f, 14f)
                lineTo(11f, 14f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(1f, 13f)
                    lineTo(9f, 13f)
                    lineTo(9f, 9f)
                    lineTo(15f, 9f)
                    lineTo(15f, 4f)
                    lineTo(8f, 4f)
                    lineTo(7f, 3f)
                    curveTo(6.22f, 2.29f, 5.62f, 2.03f, 4.98f, 2.00f)
                    lineTo(1f, 2f)
                    curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                    lineTo(1f, 13f)
                    close()
                }
            }
        }.build()

        return _Ideaproject!!
    }

private var _Ideaproject: ImageVector? = null

