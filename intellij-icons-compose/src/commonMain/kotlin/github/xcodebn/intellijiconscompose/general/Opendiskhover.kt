package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Opendiskhover: ImageVector
    get() {
        if (_Opendiskhover != null) return _Opendiskhover!!

        _Opendiskhover = ImageVector.Builder(
            name = "Opendiskhover",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 4f)
                lineTo(0f, 9f)
                lineTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(5f, 0f)
                lineTo(6f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 4f)
                lineTo(2f, 4f)
                close()
                moveTo(3f, 5f)
                lineTo(15f, 5f)
                lineTo(12f, 11f)
                lineTo(0f, 11f)
                lineTo(3f, 5f)
                close()
            }
        }.build()

        return _Opendiskhover!!
    }

private var _Opendiskhover: ImageVector? = null

