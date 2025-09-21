package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flattenpackages: ImageVector
    get() {
        if (_Flattenpackages != null) return _Flattenpackages!!

        _Flattenpackages = ImageVector.Builder(
            name = "Flattenpackages",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(4f, 1f)
                lineTo(0f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(4f, 1f)
                lineTo(0f, 1f)
                close()
            }
        }.build()

        return _Flattenpackages!!
    }

private var _Flattenpackages: ImageVector? = null

