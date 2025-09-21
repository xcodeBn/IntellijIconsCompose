package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Xml: ImageVector
    get() {
        if (_Xml != null) return _Xml!!

        _Xml = ImageVector.Builder(
            name = "Xml",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(1f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 9f)
                lineTo(1f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(3f, 13f)
                lineTo(3f, 12f)
                lineTo(6f, 10f)
                lineTo(6f, 11f)
                lineTo(4f, 12f)
                lineTo(6f, 14f)
                lineTo(6f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(8f, 14f)
                lineTo(10f, 12f)
                lineTo(8f, 11f)
                lineTo(8f, 10f)
                lineTo(11f, 12f)
                lineTo(11f, 13f)
                lineTo(8f, 15f)
                close()
            }
        }.build()

        return _Xml!!
    }

private var _Xml: ImageVector? = null

