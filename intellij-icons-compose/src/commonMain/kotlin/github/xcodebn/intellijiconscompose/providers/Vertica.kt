package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Vertica: ImageVector
    get() {
        if (_Vertica != null) return _Vertica!!

        _Vertica = ImageVector.Builder(
            name = "Vertica",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF2F2F2))
            ) {
                moveTo(11f, 3f)
                lineTo(8f, 10f)
                lineTo(5f, 3f)
                lineTo(3f, 3f)
                lineTo(8f, 13f)
                lineTo(13f, 3f)
                close()
            }
        }.build()

        return _Vertica!!
    }

private var _Vertica: ImageVector? = null

