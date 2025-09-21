package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmaccess: ImageVector
    get() {
        if (_Cwmaccess != null) return _Cwmaccess!!

        _Cwmaccess = ImageVector.Builder(
            name = "Cwmaccess",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(15f, 9f)
                moveTo(13f, 12f)
            }
        }.build()

        return _Cwmaccess!!
    }

private var _Cwmaccess: ImageVector? = null

