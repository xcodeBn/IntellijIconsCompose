package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Actualzoom: ImageVector
    get() {
        if (_Actualzoom != null) return _Actualzoom!!

        _Actualzoom = ImageVector.Builder(
            name = "Actualzoom",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(3f, 12f)
                lineTo(3f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 12f)
                lineTo(11f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 12f)
                close()
            }
        }.build()

        return _Actualzoom!!
    }

private var _Actualzoom: ImageVector? = null

