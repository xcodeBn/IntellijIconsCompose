package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Showlibrarycontents: ImageVector
    get() {
        if (_Showlibrarycontents != null) return _Showlibrarycontents!!

        _Showlibrarycontents = ImageVector.Builder(
            name = "Showlibrarycontents",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(1f, 13f)
                lineTo(3f, 13f)
                lineTo(3f, 3f)
                lineTo(1f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 13f)
                lineTo(6f, 13f)
                lineTo(6f, 3f)
                lineTo(4f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(10f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 3f)
                lineTo(10f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(7f, 13f)
                lineTo(9f, 13f)
                lineTo(9f, 1f)
                lineTo(7f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(13f, 13f)
                lineTo(15f, 13f)
                lineTo(15f, 5f)
                lineTo(13f, 5f)
                close()
            }
        }.build()

        return _Showlibrarycontents!!
    }

private var _Showlibrarycontents: ImageVector? = null

