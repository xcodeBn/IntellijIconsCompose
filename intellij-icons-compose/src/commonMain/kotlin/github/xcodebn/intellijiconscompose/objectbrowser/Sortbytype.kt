package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sortbytype: ImageVector
    get() {
        if (_Sortbytype != null) return _Sortbytype!!

        _Sortbytype = ImageVector.Builder(
            name = "Sortbytype",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 10f)
                lineTo(9f, 14f)
                lineTo(1f, 14f)
                close()
            }
        }.build()

        return _Sortbytype!!
    }

private var _Sortbytype: ImageVector? = null

