package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dropplace: ImageVector
    get() {
        if (_Dropplace != null) return _Dropplace!!

        _Dropplace = ImageVector.Builder(
            name = "Dropplace",
            defaultWidth = 2.0.dp,
            defaultHeight = 20.0.dp,
            viewportWidth = 2.0f,
            viewportHeight = 20.0f
        ).apply {

        }.build()

        return _Dropplace!!
    }

private var _Dropplace: ImageVector? = null

