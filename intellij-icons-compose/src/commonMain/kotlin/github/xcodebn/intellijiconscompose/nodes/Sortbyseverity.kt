package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sortbyseverity: ImageVector
    get() {
        if (_Sortbyseverity != null) return _Sortbyseverity!!

        _Sortbyseverity = ImageVector.Builder(
            name = "Sortbyseverity",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Sortbyseverity!!
    }

private var _Sortbyseverity: ImageVector? = null

