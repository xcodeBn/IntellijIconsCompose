package github.xcodebn.intellijiconscompose.toolbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Filterdups: ImageVector
    get() {
        if (_Filterdups != null) return _Filterdups!!

        _Filterdups = ImageVector.Builder(
            name = "Filterdups",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 8f)
                lineTo(12f, 8f)
                lineTo(8f, 12f)
                lineTo(4f, 8f)
                lineTo(7f, 8f)
                lineTo(7f, 2f)
                lineTo(9f, 2f)
                close()
            }
        }.build()

        return _Filterdups!!
    }

private var _Filterdups: ImageVector? = null

