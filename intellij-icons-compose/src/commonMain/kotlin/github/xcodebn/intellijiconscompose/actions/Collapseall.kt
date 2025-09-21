package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Collapseall: ImageVector
    get() {
        if (_Collapseall != null) return _Collapseall!!

        _Collapseall = ImageVector.Builder(
            name = "Collapseall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 2f)
                lineTo(12f, 6f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 10f)
                lineTo(12f, 14f)
                lineTo(4f, 14f)
                close()
            }
        }.build()

        return _Collapseall!!
    }

private var _Collapseall: ImageVector? = null

